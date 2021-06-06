<template>
    <a-list item-layout="vertical" size="large" :pagination="pagination" :data-source="classList">
        <template #footer>
            <div style="text-align: center">
                <b>课程列表</b>
                <br/>
                雨选课
            </div>
        </template>
        <template #renderItem="{ item }">
            <a-list-item key="item.title">
                <template #actions>
                </template>
                <template #extra>
                    <img
                            width="272"
                            alt="logo"
                            src="../assets/logo.jpg"
                    />
                </template>
                <a-list-item-meta :description="'课程介绍'">
                    <template #title>
                        <router-link to="/class-info">
                            {{ item.classname }}
                        </router-link>
                    </template>
                </a-list-item-meta>
                {{ item.desc }}
            </a-list-item>
        </template>
    </a-list>
</template>

<script lang="ts">

    import {ref,defineComponent,onMounted} from "vue";
    import { message } from 'ant-design-vue';
    import axios from "axios";

    export default {
        name: "home-view",
        setup() {

            //课程列表
            const classList = ref();

            //分页参数
            // const pagination = ref({
            //     current: 1,
            //     pageSize: 3,
            //     total: 0
            // });

            const pagination = {
                onChange: page => {
                    handleQuery({
                        page: page,
                        size: 3
                    })
                },
                pageSize: 3,
                total: 90
            };


            /**
             * 每次到当前页面时，执行查询
             */
            const handleQueryClass = () => {
                axios.get("/class/list",{
                    params: {
                        page:1,
                        //固定每页三条
                        size: 9,
                    }
                }).then(resp=>{
                    const data=resp.data;
                    if(data.success) {
                        classList.value=data.content.list;
                        const total = data.content.total
                        pagination.total=total;
                        console.log("查询到的总条数为:"+total)
                        console.log("查询到的课程信息为:"+classList.value);
                        message.success("课程查询成功");
                    } else {
                        message.error(data.message);
                    }
                })
            }


            /**
             * 执行单次查询
             */
            const handleQuery = (p) => {
                axios.get("/class/list",{
                    params: {
                        page: p.page,
                        size: p.size,
                    }
                }).then(resp=>{
                    const data=resp.data;
                    if(data.success) {
                        classList.value=data.content.list;
                        const total = data.content.total
                        pagination.total=total;
                        console.log("查询到的总条数为:"+total)
                        console.log("查询到的课程信息为:"+classList.value);
                    } else {
                        message.error(data.message);
                    }
                })
            }

            /**
             * 分页响应函数
             * @param pagination
             */
            // const handleTableChange = (pagination) => {
            //     alert("触发了分页函数")
            //     console.log("看看自带的分页参数都有啥：" + JSON.stringify(pagination));
            //     handleQuery({
            //         page: pagination.current,
            //         size: pagination.pageSize
            //     });
            // };


            onMounted(()=>{
                handleQueryClass();
            });

            return {
                pagination,
                classList,
            };
        },
    }
</script>

<style scoped>
    /*#components-layout-demo-side .logo {*/
    /*    height: 32px;*/
    /*    margin: 16px;*/
    /*    background: rgba(255, 255, 255, 0.3);*/
    /*}*/

    /*.site-layout .site-layout-background {*/
    /*    background: #fff;*/
    /*}*/
    /*[data-theme='dark'] .site-layout .site-layout-background {*/
    /*    background: #141414;*/
    /*}*/
</style>