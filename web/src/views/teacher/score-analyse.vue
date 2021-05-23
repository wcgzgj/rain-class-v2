
<!--成绩分析-->
<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <a-row>
            <a-col :span="20" :offset="2">
                <a-tag color="blue">
                    课程及格率
                </a-tag>
            </a-col>
            <a-col :span="20" :offset="2">
                数据结构:<a-progress :percent="80" />
                计算机网络:<a-progress :percent="65" status="active" />
                操作系统:<a-progress :percent="92" status="active" />
            </a-col>
        </a-row>

        <br/>
        <br/>
        <br/>

        <a-row>
            <a-col :span="20" :offset="2">
                <a-tag color="blue">
                    课程满意度
                </a-tag>
            </a-col>
            <a-col :span="20" :offset="2">
                数据结构:<a-progress :percent="98" />
                计算机网络:<a-progress :percent="80" status="active" />
                操作系统:<a-progress :percent="78" status="active" />
            </a-col>
        </a-row>


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