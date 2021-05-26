<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <a-modal v-model:visible="visible" title="学生联系方式" @ok="handleOk">
            <a-descriptions title="Stu Info">
                <a-descriptions-item label="学生姓名">JOJO</a-descriptions-item>
                <a-descriptions-item label="学生电话">1810000000</a-descriptions-item>
                <a-descriptions-item label="课程成绩">59</a-descriptions-item>
                <a-descriptions-item label="是否重考">是</a-descriptions-item>
            </a-descriptions>
        </a-modal>

        <a-modal v-model:visible="visible2" title="家长联系方式" @ok="handleOk2">
            <a-descriptions title="Parent Info">
                <a-descriptions-item label="家长姓名">Jo</a-descriptions-item>
                <a-descriptions-item label="学生电话">1872322171</a-descriptions-item>
            </a-descriptions>
        </a-modal>

        <a-list :grid="{ gutter: 5, xs: 1, sm: 2, md: 4, lg: 4, xl: 3, xxl: 4 }" :data-source="data">
            <template #renderItem="{ item }">
                <a-list-item>
                    <a-card hoverable style="width: 300px">
                        <template #cover>
                            <img
                                    alt="example"
                                    src="https://gw.alipayobjects.com/zos/rmsportal/JiqGstEfoWAOHiTxclqi.png"
                            />
                        </template>
                        <template class="ant-card-actions" #actions>
                            <a-button type="primary" @click="showModal">通知学生</a-button>
                            <a-button type="primary" @click="showModal2">告知家长</a-button>
                        </template>
                        <a-card-meta title="JOJO" description="数据结构 告危">
                            <template #avatar>
                                <a-avatar src="https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png" />
                            </template>
                        </a-card-meta>
                    </a-card>
                </a-list-item>
            </template>
        </a-list>

    </div>
</template>

<script lang="ts">

    import { SettingOutlined, EditOutlined, EllipsisOutlined } from '@ant-design/icons-vue';
    import { defineComponent,ref } from 'vue';
    interface DataItem {
        title: string;
    }
    const data: DataItem[] = [
        {
            title: 'Title 1',
        },
        {
            title: 'Title 2',
        },
        {
            title: 'Title 3',
        },
        {
            title: 'Title 4',
        },
        {
            title: 'Title 5',
        },
        {
            title: 'Title 6',
        },
    ];



    export default {
        components: {
            SettingOutlined,
            EditOutlined,
            EllipsisOutlined,
        },
        name: "score-alert",
        setup() {

            const visible = ref(false);
            const visible2 = ref(false);

            const showModal = () => {
                visible.value = true;
            };

            const handleOk = (e: MouseEvent) => {
                console.log(e);
                visible.value = false;
            };

            const showModal2 = () => {
                visible2.value = true;
            };

            const handleOk2 = (e: MouseEvent) => {
                console.log(e);
                visible2.value = false;
            };

            return {
                data,
                visible,
                showModal,
                handleOk,

                visible2,
                showModal2,
                handleOk2,
            };
        },
    }
</script>

<style scoped>

</style>