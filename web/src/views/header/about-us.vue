<!--关于我们-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-descriptions title="关于我们" layout="vertical">
                    <a-descriptions-item label="UserName">
                        <b>FARO_Z</b>
                    </a-descriptions-item>
                    <a-descriptions-item label="Telephone">
                        <b>18012224600</b>
                    </a-descriptions-item>
                    <a-descriptions-item label="Live">
                        <b>Jiangsu,Nanjing</b>
                    </a-descriptions-item>
                    <a-descriptions-item label="Address" span="2">
                        <b>No. 1, Xixia Road, Nanjing Normal University, Nanjing, Jiangsu, China</b>
                    </a-descriptions-item>
                    <a-descriptions-item label="Remark">
                        <b>雨选课，自由的选课平台</b>
                    </a-descriptions-item>
                </a-descriptions>

                <a-collapse v-model:activeKey="activeKey" accordion>
                    <a-collapse-panel key="1" header="我们的宗旨">
                        <p>{{ text }}</p>
                    </a-collapse-panel>
                    <a-collapse-panel key="2" header="我们的目标" :disabled="false">
                        <p>{{ text }}</p>
                    </a-collapse-panel>
                    <a-collapse-panel key="3" header="未来的希望">
                        <p>{{ text }}</p>
                    </a-collapse-panel>
                </a-collapse>

                <br/>
                <br/>

                <h4>请为我们的平台打分:</h4>
                <span>
                    <a-rate v-model:value="value" :tooltips="desc" />
                    <span class="ant-rate-text">{{ desc[value - 1] }}</span>
                </span>

            </div>
        </a-layout-content>
        <a-layout-footer :style="{ textAlign: 'center' }">
            雨选课 ©2021 Created by FARO_Z
        </a-layout-footer>
    </a-layout>
</template>

<script lang="ts">
    import { defineComponent, ref } from 'vue';
    export default {
        name: "about-us",
        setup() {
            const value = ref<number>(3);
            const desc = ref<string[]>(['terrible', 'bad', 'normal', 'good', 'wonderful']);

            const activeKey = ref([]);
            const text = `雨选课，自由的选课系统，人性化的管理工具`;

            return {
                value,
                desc,

                activeKey,
                text,
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