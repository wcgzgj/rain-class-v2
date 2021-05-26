<template>
    <a-layout-header class="header">
        <div class="logo" />
        <a-menu
                theme="dark"
                mode="horizontal"
                v-model:selectedKeys="selectedKeys1"
                :style="{ lineHeight: '64px' }"
        >

            <a-menu-item key="/">
                <router-link to="/">雨选课</router-link>
            </a-menu-item>

            <!--<a-menu-item key="/admin/user" :style="user.id? {} : {display:'none'}">-->
            <!--    <router-link to="/admin/user">用户管理</router-link>-->
            <!--</a-menu-item>-->

            <a-menu-item key="/info">
                <router-link to="/info">行业信息</router-link>
            </a-menu-item>

            <a-menu-item key="2">
                <router-link to="/download">下载区</router-link>
            </a-menu-item>

            <a-menu-item key="3">
                <router-link to="/score-search">成绩查询</router-link>
            </a-menu-item>

            <a-menu-item key="4">
                <router-link to="/comment">留言板</router-link>
            </a-menu-item>

            <a-menu-item key="5">
                <router-link to="/make-test">网上测试</router-link>
            </a-menu-item>

            <a-menu-item key="/about-us">
                <router-link to="/about-us">关于我们</router-link>
            </a-menu-item>


            <!--气泡确认框-->
            <a-popconfirm
                    title="是否退出？"
                    ok-text="确认"
                    cancel-text="取消"
                    @confirm="logout"
            >
                <a class="login-menu" v-show="user.id">
                    <span>退出登录</span>
                </a>
            </a-popconfirm>

            <!--下面两个部分，是互斥显示的-->
            <!--当 user 有数据的时候，显示 您好: xxx-->
            <!--当 user 没有数据的时候，说明没有登录，就显示登录按钮-->
            <a class="login-menu" v-show="user.id">
                <span>你好: {{user.name}}</span>
            </a>


            <a class="login-menu" @click="showLoginModal" v-show="!user.id">
                <span>登录</span>
            </a>
            <a class="login-menu" @click="showRegisterModal" v-show="!user.id">
                <span>注册</span>
            </a>

        </a-menu>
    </a-layout-header>


    <!--注册-->
    <!--<a-modal-->
    <!--        title="注册表单"-->
    <!--        v-model:visible="registerModalVisible"-->
    <!--        :confirm-loading="registerModalLoading"-->
    <!--        @ok="login"-->
    <!--&gt;-->
    <!--    <a-form :model="loginUser" :label-col="{ span: 6 }" :wrapper-col="{ span: 18 }">-->
    <!--        <a-form-item label="用户名">-->
    <!--            <a-input v-model:value="loginUser.loginName" />-->
    <!--        </a-form-item>-->
    <!--        <a-form-item label="密码">-->
    <!--            <a-input v-model:value="loginUser.password" type="password"/>-->
    <!--        </a-form-item>-->
    <!--        <a-form-item label="身份选择">-->
    <!--            <a-radio-group v-model:value="role" button-style="solid">-->
    <!--                <a-radio-button value="stu">学生</a-radio-button>-->
    <!--                <a-radio-button value="sta">老师</a-radio-button>-->
    <!--                <a-radio-button value="admin">管理员</a-radio-button>-->
    <!--            </a-radio-group>-->
    <!--        </a-form-item>-->
    <!--    </a-form>-->
    <!--</a-modal>-->


    <!--登录-->
    <a-modal
            title="登录表单"
            v-model:visible="loginModalVisible"
            :confirm-loading="loginModalLoading"
            @ok="login"
    >
        <a-form :model="loginUser" :label-col="{ span: 6 }" :wrapper-col="{ span: 18 }">
            <a-form-item label="用户名">
                <a-input v-model:value="loginUser.loginName" />
            </a-form-item>
            <a-form-item label="密码">
                <a-input v-model:value="loginUser.password" type="password"/>
            </a-form-item>
            <a-form-item label="身份选择">
                <a-radio-group v-model:value="role" button-style="solid">
                    <a-radio-button value="stu">学生</a-radio-button>
                    <a-radio-button value="sta">老师</a-radio-button>
                    <a-radio-button value="admin">管理员</a-radio-button>
                </a-radio-group>
            </a-form-item>
        </a-form>
    </a-modal>
</template>

<script lang="ts">
    import { defineComponent, ref ,computed} from 'vue';
    import axios from "axios";
    import {message} from "ant-design-vue";
    import store from "@/store";

    declare let hexMd5;
    declare let KEY;

    export default {
        name: "the-header",

        setup() {
            const loginUser = ref();
            loginUser.value= {
                loginName: "test",
                password: "abc123"
            };

            // 登录人角色单选框
            const role=ref();
            role.value="stu";

            const user = computed(() => store.state.user);

            const loginModalVisible = ref();
            loginModalVisible.value=false;

            const loginModalLoading = ref();
            loginModalLoading.value=false;

            const showLoginModal= ()=> {
                loginModalVisible.value=true;
            }

            const showRegisterModal = () => {

            }


            /**
             * 登录
             */
            const login = () => {
                console.log("开始登录!")
                loginModalLoading.value=true;

                loginUser.value.password = hexMd5(loginUser.value.password + KEY);
                //每次登录的时候，要将选择的角色，一并选中
                loginUser.value.role=role.value;

                axios.post("/user/login",loginUser.value).then((response)=>{
                    loginModalLoading.value=false;
                    const data = response.data;
                    if (data.success) {
                        loginModalVisible.value=false;
                        message.success("登录成功!")
                        /**
                         * setUser: vuex 中 mutations中的方法
                         *
                         * 后面的参数，都是我们在 mutations 中自定义方法的参数
                         * state 参数因为是自带的，所以没有必要写
                         */
                        store.commit("setUser",data.content);
                    } else {
                        /**
                         * 使用 antd 的组件，弹出错误信息
                         */
                        message.error(data.message);
                    }
                });
            }

            /**
             * 退出登录
             */
            const logout = () => {
                console.log("退出登录!")

                axios.get("/user/logout/"+user.value.token).then((response)=>{
                    const data = response.data;
                    if (data.success) {
                        loginModalVisible.value=false;
                        message.success("退出登录成功!")

                        /**
                         * 退出登录时
                         * 将 sessionStorage 中对应 user的信息清空
                         * 因为
                         */
                        store.commit("setUser", {});
                    } else {
                        /**
                         * 使用 antd 的组件，弹出错误信息
                         */
                        message.error(data.message);
                    }
                });
            }

            return {
                //ref
                loginUser,
                loginModalVisible,
                loginModalLoading,
                user,
                role,

                //method
                showLoginModal,
                login,
                logout
            }
        }

    }
</script>

<style scoped>
    .login-menu {
        float: right;
        color: white;
        padding-left: 10px;
    }
</style>