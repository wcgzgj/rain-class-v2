<!--出考题，给学生做-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <h1>我的课程</h1>

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
                                        src="../../assets/数据结构.jpg"
                                />
                            </template>
                            <a-list-item-meta :description="item.description">
                                <template #title>
                                    <router-link :to="item.href">
                                        {{ item.title }}
                                    </router-link>
                                </template>
                            </a-list-item-meta>
                            {{ item.content }}
                        </a-list-item>
                    </template>
                </a-list>

            </div>
        </a-layout-content>
        <a-layout-footer :style="{ textAlign: 'center' }">
            雨选课 ©2021 Created by FARO_Z
        </a-layout-footer>
    </a-layout>
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
            href: '/class-info',
            title: `数据结构 ${i}`,
            description:
                '课程介绍',
            content:
                '数据结构（英语：data structure）是计算机中存储、组织数据的方式。数据结构是一种具有一定逻辑关系，在计算机中应用某种存储结构，并且封装了相应操作的数据元素集合。它包含三方面的内容，逻辑关系、存储关系及操作。',
        });
    }


    export default {
        name: "make-test",
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