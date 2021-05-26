<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <a-result title="很好，您的学生成绩处于正常水平">
            <template #icon>
                <smile-twoTone />
            </template>
            <template #extra>
                <a-button type="primary">获取更多资讯</a-button>
            </template>
        </a-result>

    </div>
</template>

<script>
    import { SmileTwoTone } from '@ant-design/icons-vue';
    import { defineComponent } from 'vue';

    export default {
        name: "score-info",
        components: {
            SmileTwoTone,
        },
    }
</script>

<style scoped>

</style>