<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <a-typography>
            <a-typography-title>数据结构：</a-typography-title>
            <a-typography-paragraph>
                数据结构（英语：data structure）是计算机中存储、组织数据的方式。
                数据结构是一种具有一定逻辑关系，在计算机中应用某种存储结构，并且封装了相应操作的数据元素集合。它包含三方面的内容，逻辑关系、存储关系及操作。
                不同种类的数据结构适合于不同种类的应用，而部分甚至专门用于特定的作业任务。例如，计算机网络依赖于路由表运作，B 树高度适用于数据库的封装。
            </a-typography-paragraph>

        </a-typography>


        <a-descriptions bordered title="课程信息：" :size="size">
            <template #extra>
                <a-popconfirm
                        title="确认选择该课程？"
                        ok-text="是"
                        cancel-text="否"
                        @confirm="confirm"
                        @cancel="cancel"
                >

                    <a-button type="primary">
                        选择
                    </a-button>
                </a-popconfirm>

            </template>
            <a-descriptions-item label="教师">DIO</a-descriptions-item>
            <a-descriptions-item label="上课地点">学明楼209</a-descriptions-item>
            <a-descriptions-item label="上课时间">周三 下午8-9</a-descriptions-item>
            <a-descriptions-item label="注意事项">带好课本</a-descriptions-item>
            <a-descriptions-item label="学分">4</a-descriptions-item>
            <a-descriptions-item label="课程类型">专业主干课</a-descriptions-item>
            <a-descriptions-item label="其他信息">
                教学内容：数据结构基础内容
                <br />
                是否上机：是
                <br />
                课堂要求：关闭手机，好好听讲
            </a-descriptions-item>
        </a-descriptions>

    </div>
</template>

<script>
    import { defineComponent } from 'vue';
    import { message } from 'ant-design-vue';
    import router from "../../router/index.ts";
    // router.push("/");
    export default {
        name: "class-info",
        setup() {
            const confirm = e => {
                console.log(e);
                message.success('课程选择成功！');
                router.push("/select-class")
            };

            const cancel = e => {
                console.log(e);
                message.error('取消选择！');
            };

            return {
                confirm,
                cancel,
            };
        },
    }
</script>

<style scoped>

</style>