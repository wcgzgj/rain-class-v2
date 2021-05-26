<!--网上测试-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

               这里，要显示的

                是学生上网做测试，然后老师可以进行批改！！！

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


</style>