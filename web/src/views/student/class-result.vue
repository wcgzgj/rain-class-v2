<!--选课结果-->
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
        <a-list :grid="{ gutter: 5, column: 4 }" size="large" :data-source="listData">
            <template #footer>
                <div style="text-align: center">
                    <b>选课结果</b>
                    <br/>
                    雨选课
                </div>
            </template>
            <template #renderItem="{ item }">
                <!--这里是list的key值，暂时还没想好些什么-->
                <a-list-item key="key" >
                    <a-card hoverable style="width: 300px">
                        <template #cover>
                            <img
                                    alt="example"
                                    src="../../assets/数据结构.jpg"
                            />
                        </template>
                        <a-card-meta title="课程介绍" :description="item.content">

                        </a-card-meta>

                        <br/>
                        <router-link to="/my-class-info">
                            <a-button type="primary">查看详情</a-button>
                        </router-link>
                    </a-card>
                </a-list-item>
            </template>
        </a-list>


    </div>
</template>

<script lang="ts">

    import { StarOutlined,
        LikeOutlined,
        MessageOutlined,
        SettingOutlined,
        EditOutlined,
        EllipsisOutlined } from '@ant-design/icons-vue';
    import { defineComponent } from 'vue';

    const listData: Record<string, string>[] = [];

    for (let i = 0; i < 1; i++) {
        listData.push({
            href: '../../assets/数据结构.jpg',
            title: `数据结构 ${i}`,
            description:
                '课程介绍',
            content:
                '数据结构（英语：data structure）是计算机中存储、组织数据的方式。数据结构是一种具有一定逻辑关系，在计算机中应用某种存储结构，并且封装了相应操作的数据元素集合。它包含三方面的内容，逻辑关系、存储关系及操作。',
        });
    }


    export default {
        name: "class-result",
        components: {
            StarOutlined,
            LikeOutlined,
            MessageOutlined,
            SettingOutlined,
            EditOutlined,
            EllipsisOutlined,
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
                listData,
                pagination,
                actions,
            };
        },
    }
</script>

<style scoped>

</style>