<template>
    <!--<a-layout>-->
    <!--    <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">-->

    <!--        -->
    <!--    </a-layout-content>-->
    <!--    <a-layout-footer :style="{ textAlign: 'center' }">-->
    <!--        雨选课 ©2021 Created by FARO_Z-->
    <!--    </a-layout-footer>-->
    <!--</a-layout>-->

    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <a-form
                layout="inline"
                :model="formState"
                @finish="handleFinish"
                @finishFailed="handleFinishFailed"
        >
            <a-form-item>
                <a-input v-model:value="formState.user" placeholder="Username">
                    <template #prefix><UserOutlined style="color: rgba(0, 0, 0, 0.25)" /></template>
                </a-input>
            </a-form-item>
            <a-form-item>
                <a-input v-model:value="formState.password" type="password" placeholder="Password">
                    <template #prefix><LockOutlined style="color: rgba(0, 0, 0, 0.25)" /></template>
                </a-input>
            </a-form-item>
            <a-form-item>
                <a-button
                        type="primary"
                        html-type="submit"
                >
                    Log in
                </a-button>
            </a-form-item>
        </a-form>


        <a-list item-layout="vertical" size="large" :pagination="pagination" :data-source="listData">
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
          <span v-for="{ type, text } in actions" :key="type">
            <component v-bind:is="type" style="margin-right: 8px" />
            {{ text }}
          </span>
                    </template>
                    <template #extra>
                        <img
                                width="272"
                                alt="logo"
                                src="https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png"
                        />
                    </template>
                    <a-list-item-meta :description="item.description">
                        <template #title>
                            <a :href="item.href">{{ item.title }}</a>
                        </template>
                        <template #avatar><a-avatar :src="item.avatar" /></template>
                    </a-list-item-meta>
                    {{ item.content }}
                </a-list-item>
            </template>
        </a-list>

    </div>

</template>

<script lang="ts">
    import { StarOutlined, LikeOutlined, MessageOutlined } from '@ant-design/icons-vue';
    import { defineComponent, reactive, UnwrapRef } from 'vue';
    import { UserOutlined, LockOutlined } from '@ant-design/icons-vue';
    import { ValidateErrorEntity } from 'ant-design-vue/es/form/interface';

    interface FormState {
        user: string;
        password: string;
    }

    const listData: Record<string, string>[] = [];

    for (let i = 0; i < 23; i++) {
        listData.push({
            href: 'https://www.antdv.com/',
            title: `ant design vue part ${i}`,
            avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
            description:
                'Ant Design, a design language for background applications, is refined by Ant UED Team.',
            content:
                'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
        });
    }

    export default {
        name: "select-class",
        components: {
            StarOutlined,
            LikeOutlined,
            MessageOutlined,
            UserOutlined,
            LockOutlined,
        },
        setup() {
            const pagination = {
                onChange: (page: number) => {
                    console.log(page);
                },
                pageSize: 3,
            };
            const actions: Record<string, string>[] = [
                { type: 'StarOutlined', text: '156' },
                { type: 'LikeOutlined', text: '156' },
                { type: 'MessageOutlined', text: '2' },
            ];

            const formState: UnwrapRef<FormState> = reactive({
                user: '',
                password: '',
            });
            const handleFinish = (values: FormState) => {
                console.log(values, formState);
            };
            const handleFinishFailed = (errors: ValidateErrorEntity<FormState>) => {
                console.log(errors);
            };

            return {
                listData,
                pagination,
                actions,

                formState,
                handleFinish,
                handleFinishFailed,
            };
        },
    }
</script>

<style scoped>

</style>