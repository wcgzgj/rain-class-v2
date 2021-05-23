<!--网上测试-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                <a-result
                        status="success"
                        title="本站已安全运行30天"
                        sub-title="Order number: 2017182818828182881 Cloud server configuration takes 1-5 minutes, please wait."
                >
                    <template #extra>
                        <a-button key="console" type="primary">返回首页</a-button>
                        <a-button key="buy">探寻更多</a-button>
                    </template>
                </a-result>

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