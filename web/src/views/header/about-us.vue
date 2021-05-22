<!--关于我们-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-typography-title>h1. Ant Design Vue</a-typography-title>
                <a-typography-title :level="2">h2. Ant Design Vue</a-typography-title>
                <a-typography-title :level="3">h3. Ant Design Vue</a-typography-title>
                <a-typography-title :level="4">h4. Ant Design Vue</a-typography-title>
                <a-typography-title :level="5">h5. Ant Design Vue</a-typography-title>

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
            return {
                value,
                desc,
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