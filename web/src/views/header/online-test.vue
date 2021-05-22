<!--网上测试-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-skeleton avatar :paragraph="{ rows: 4 }" />
                <a-divider />
                <a-skeleton avatar :paragraph="{ rows: 4 }" />
                <a-divider />
                <a-skeleton avatar :paragraph="{ rows: 4 }" />
                <a-divider />
                <a-skeleton avatar :paragraph="{ rows: 4 }" />

            </div>
        </a-layout-content>
        <a-layout-footer :style="{ textAlign: 'center' }">
            雨选课 ©2021 Created by FARO_Z
        </a-layout-footer>
    </a-layout>
</template>

<script>
    export default {
        name: "online-test"
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