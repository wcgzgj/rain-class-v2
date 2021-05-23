
<!--成绩分析-->
<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">


        <a-layout>
            <a-layout-header>课程及格率</a-layout-header>
            <a-layout-content>
                数据结构:<a-progress :percent="30" />
                计算机网络:<a-progress :percent="50" status="active" />
                操作系统:<a-progress :percent="50" status="active" />
            </a-layout-content>
        </a-layout>



        <a-progress type="circle" :percent="75" />
        <a-progress type="circle" :percent="70" status="exception" />
        <a-progress type="circle" :percent="100" />

    </div>
</template>

<script>
    export default {
        name: "score-analyse"
    }
</script>

<style scoped>
    #components-layout-demo-side .logo {

    }

    .site-layout .site-layout-background {

    }
    [data-theme='dark'] .site-layout .site-layout-background {

    }
</style>