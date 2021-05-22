<!--下载区-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-list :grid="{ gutter: 16, xs: 1, sm: 2, md: 4, lg: 4, xl: 6, xxl: 3 }" :data-source="data">
                    <template #renderItem="{ item }">
                        <a-list-item>
                            <a-card :title="item.title">
                                <router-link to="/">
                                    点击了解更多
                                </router-link>
                            </a-card>
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

<script  lang="ts">

    interface DataItem {
        title: string;
    }

    const data: DataItem[] = [
        {
            title: 'MicroSoft软件专区',
        },
        {
            title: '学习软件专区',
        },
        {
            title: '硬件专区',
        },
        {
            title: '校园软件激活',
        },
        {
            title: '版权认证专区',
        },
        {
            title: '版权受理',
        },
    ];

    export default {

        name: "download",
        setup() {
            return {
                data,
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

    .demo-loadmore-list {
        min-height: 350px;
    }
</style>