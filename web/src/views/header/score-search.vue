<!--成绩查询-->
<template>
    <a-layout>


        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">


            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-input-search
                        v-model:value="value"
                        placeholder="请输入课程名称"
                        enter-button

                        @search="onSearch"
                />

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
        </a-layout-content>
        <a-layout-footer :style="{ textAlign: 'center' }">
            雨选课 ©2021 Created by FARO_Z
        </a-layout-footer>
    </a-layout>
</template>

<script lang="ts">

    import {
        PieChartOutlined,
        DesktopOutlined,
        UserOutlined,
        TeamOutlined,
        FileOutlined,
        StarOutlined,
        LikeOutlined,
        MessageOutlined
    } from '@ant-design/icons-vue';
    import { defineComponent ,ref} from 'vue';

    const listData: Record<string, string>[] = [];

    for (let i = 0; i < 10; i++) {
        listData.push({
            href: 'https://www.antdv.com/',
            title: `数据结构 ${i}`,
            avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
            description:
                '课程介绍',
            content:
                '数据结构（英语：data structure）是计算机中存储、组织数据的方式。数据结构是一种具有一定逻辑关系，在计算机中应用某种存储结构，并且封装了相应操作的数据元素集合。它包含三方面的内容，逻辑关系、存储关系及操作。',

        });
    }


    export default {
        name: "score-search",
        components: {
            PieChartOutlined,
            DesktopOutlined,
            UserOutlined,
            TeamOutlined,
            FileOutlined,
            StarOutlined,
            LikeOutlined,
            MessageOutlined
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

            return {
                collapsed: ref<boolean>(false),
                selectedKeys: ref<string[]>(['1']),
                listData,

                pagination,
                actions
            };
        },
    }
</script>

<style scoped>
    /*#components-layout-demo-fixed .logo {*/
    /*    width: 120px;*/
    /*    height: 31px;*/
    /*    background: rgba(255, 255, 255, 0.2);*/
    /*    margin: 16px 24px 16px 0;*/
    /*    float: left;*/
    /*}*/
    /*.site-layout .site-layout-background {*/
    /*    background: #fff;*/
    /*}*/

    /*[data-theme='dark'] .site-layout .site-layout-background {*/
    /*    background: #141414;*/
    /*}*/
</style>