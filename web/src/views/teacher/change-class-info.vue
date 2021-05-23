<!--修改自己的课程信息-->
<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">


        <!--学生到课统计表-->
        <div style="background: #ececec; padding: 30px;">
            <a-row :gutter="16">
                <a-col :span="12">
                    <a-card>
                        <a-statistic
                                title="学生出勤率"
                                :value="98"
                                :precision="2"
                                suffix="%"
                                :value-style="{ color: '#3f8600' }"
                                style="margin-right: 50px"
                        >
                            <template #prefix>
                                <arrow-up-outlined />
                            </template>
                        </a-statistic>
                    </a-card>
                </a-col>
                <a-col :span="12">
                    <a-card>
                        <a-statistic
                                title="学生未到率"
                                :value="2"
                                :precision="2"
                                suffix="%"
                                class="demo-class"
                                :value-style="{ color: '#cf1322' }"
                        >
                            <template #prefix>
                                <arrow-down-outlined />
                            </template>
                        </a-statistic>
                    </a-card>
                </a-col>
            </a-row>
        </div>



        <!--学生信息表格-->
        <a-table :columns="columns" :data-source="dataSource" bordered>
            <template v-for="col in ['name', 'stuid', 'score']" #[col]="{ text, record }" :key="col">
                <div>
                    <a-input
                            v-if="editableData[record.key]"
                            v-model:value="editableData[record.key][col]"
                            style="margin: -5px 0"
                    />
                    <template v-else>
                        {{ text }}
                    </template>
                </div>
            </template>
            <template #operation="{ record }">
                <div class="editable-row-operations">
                    <span v-if="editableData[record.key]">
                      <a @click="save(record.key)">Save</a>
                      <a-popconfirm title="Sure to cancel?" @confirm="cancel(record.key)">
                        <a>Cancel</a>
                      </a-popconfirm>
                    </span>
                    <span v-else>
                      <a @click="edit(record.key)">Edit</a>
                    </span>
                </div>
            </template>
        </a-table>


    </div>


</template>

<script lang="ts">
    import { ArrowUpOutlined, ArrowDownOutlined } from '@ant-design/icons-vue';
    import { defineComponent, reactive, ref, UnwrapRef } from 'vue';


    const columns = [
        {
            title: '学生姓名',
            dataIndex: 'name',
            width: '25%',
            slots: { customRender: '学生姓名' },
        },
        {
            title: '学生学号',
            dataIndex: 'stuid',
            width: '15%',
            slots: { customRender: '学号' },
        },
        {
            title: '学生成绩',
            dataIndex: 'score',
            width: '40%',
            slots: { customRender: 'score' },
        },
        {
            title: 'operation',
            dataIndex: 'operation',
            slots: { customRender: 'operation' },
        },
    ];
    interface DataItem {
        key: string;
        name: string;
        stuid: string;
        score: string;
    }
    const data: DataItem[] = [];
    for (let i = 0; i < 30; i++) {
        data.push({
            key: i.toString(),
            name: `FARO_Z ${i}`,
            stuid: '19180316',
            score: `98`,
        });
    }


    export default {
        name: "change-class-info",
        components: {
            ArrowUpOutlined,
            ArrowDownOutlined,
        },
        setup() {
            const dataSource = ref(data);
            const editableData: UnwrapRef<Record<string, DataItem>> = reactive({});

            const edit = (key: string) => {
            };
            const save = (key: string) => {
                Object.assign(dataSource.value.filter(item => key === item.key)[0], editableData[key]);
                delete editableData[key];
            };
            const cancel = (key: string) => {
                delete editableData[key];
            };
            return {
                dataSource,
                columns,
                editingKey: '',
                editableData,
                edit,
                save,
                cancel,
            };
        },
    }
</script>

<style scoped>

</style>