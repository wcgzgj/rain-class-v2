<!--做考题，老师出完的题目，可以在当前页面显示-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

                这里显示我的课程
                点开以后，显示的，是当前课程所有的测试

            </div>
        </a-layout-content>
        <a-layout-footer :style="{ textAlign: 'center' }">
            雨选课 ©2021 Created by FARO_Z
        </a-layout-footer>
    </a-layout>
</template>

<script>
    export default {
        name: "do-test"
    }
</script>

<style scoped>

</style>