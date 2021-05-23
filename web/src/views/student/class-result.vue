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
                <a-list-item key="item.title">
                    <a-card hoverable style="width: 300px">
                        <template #cover>
                            <img
                                    alt="example"
                                    src="../../assets/编译原理.jpg"
                            />
                        </template>
                        <a-card-meta title="课程介绍" :description="item.content">

                        </a-card-meta>
                        <template class="ant-card-actions" #actions>
                            <setting-outlined key="setting" />
                            <edit-outlined key="edit" />
                            <ellipsis-outlined key="ellipsis" />
                        </template>

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

    for (let i = 0; i < 7; i++) {
        listData.push({
            href: '../../assets/编译原理.jpg',
            title: `编译原理 ${i}`,
            description:
                '课程介绍',
            content:
                '编译原理》（英语：Compilers: Principles, Techniques, and Tools）是一部由阿尔佛雷德·艾侯、拉维·塞提和杰弗瑞·乌尔曼合著的计算机科学教材，探讨了编译器设计方面的若干重要课题，被视为编译原理领域的经典教材之一。',
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