<!--留言板-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-list
                        class="comment-list"
                        :header="`${data.length} replies`"
                        item-layout="horizontal"
                        :data-source="data"
                >
                    <template #renderItem="{ item }">
                        <a-list-item>
                            <a-comment :author="item.author" :avatar="item.avatar">
                                <template #actions>
                                    <span v-for="(action, index) in item.actions" :key="index">{{ action }}</span>
                                </template>
                                <template #content>
                                    <p>
                                        {{ item.content }}
                                    </p>
                                </template>
                                <template #datetime>
                                    <a-tooltip :title="item.datetime.format('YYYY-MM-DD HH:mm:ss')">
                                        <span>{{ item.datetime.fromNow() }}</span>
                                    </a-tooltip>
                                </template>
                            </a-comment>
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

    import { defineComponent, ref } from 'vue';
    import moment from 'moment';


    // const listData: Record<string, string>[] = [];
    //
    // for (let i = 0; i < 100; i++) {
    //     listData.push({
    //         href: 'https://www.antdv.com/',
    //         title: `数据结构 ${i}`,
    //         avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
    //         description:
    //             '课程介绍',
    //         content:
    //             '数据结构（英语：data structure）是计算机中存储、组织数据的方式。数据结构是一种具有一定逻辑关系，在计算机中应用某种存储结构，并且封装了相应操作的数据元素集合。它包含三方面的内容，逻辑关系、存储关系及操作。',
    //
    //     });
    // }


    export default {
        name: "comment",
        setup() {
            return {
                data: [
                    {
                        actions: ['Reply to'],
                        author: 'Han Solo',
                        avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
                        content:
                            'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
                        datetime: moment().subtract(1, 'days'),
                    },
                    {
                        actions: ['Reply to'],
                        author: 'Han Solo',
                        avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
                        content:
                            'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
                        datetime: moment().subtract(2, 'days'),
                    },
                    {
                        actions: ['Reply to'],
                        author: 'Han Solo',
                        avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
                        content:
                            'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
                        datetime: moment().subtract(2, 'days'),
                    },
                    {
                        actions: ['Reply to'],
                        author: 'Han Solo',
                        avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
                        content:
                            'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
                        datetime: moment().subtract(2, 'days'),
                    },
                ],
                moment,
            };
        },
    }
</script>

<style scoped>
    #components-layout-demo-fixed .logo {
        width: 120px;
        height: 31px;
        background: rgba(255, 255, 255, 0.2);
        margin: 16px 24px 16px 0;
        float: left;
    }
    .site-layout .site-layout-background {
        background: #fff;
    }

    [data-theme='dark'] .site-layout .site-layout-background {
        background: #141414;
    }
</style>