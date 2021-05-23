<!--课程管理-->
<template>
    <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">

        <a-table :columns="columns" :data-source="data">
            <template #name="{ text }">
                <a>{{ text }}</a>
            </template>
            <template #customTitle>
              <span>
                <smile-outlined />
                Name
              </span>
                    </template>
                    <template #tags="{ text: tags }">
              <span>
                <a-tag
                        v-for="tag in tags"
                        :key="tag"
                        :color="tag === 'loser' ? 'volcano' : tag.length > 5 ? 'geekblue' : 'green'"
                >
                  {{ tag.toUpperCase() }}
                </a-tag>
              </span>
                    </template>
                    <template #action="{ record }">
              <span>
                <a>详情 一 {{ record.name }}</a>
                <a-divider type="vertical" />
              <router-link to="/change-class-info">
                  <b>修改</b>
              </router-link>

              </span>
            </template>
        </a-table>

    </div>
</template>

<script lang="ts">

    import { SmileOutlined, DownOutlined } from '@ant-design/icons-vue';
    import { defineComponent } from 'vue';
    const columns = [
        {
            title: '课程名称',
            dataIndex: 'name',
            key: 'name',
        },
        {
            title: '课程教室',
            dataIndex: 'address',
            key: 'address',
        },
        {
            title: '课程时间',
            key: 'time',
            dataIndex: 'time',
            slots: { customRender: 'tags' },
        },
        {
            title: '操作',
            key: 'action',
            slots: { customRender: 'action' },
        },
    ];

    const data = [
        {
            key: '1',
            name: '数据结构',
            address: '明理楼 403',
            time: ['星期一','5-7 课'],
        },
        {
            key: '2',
            name: '操作系统',
            address: '学正楼 201',
            time: ['星期三','2-4课'],
        },
        {
            key: '3',
            name: '计算机网络',
            address: '学海楼 102',
            time: ['星期五','4-6 课'],
        },
    ];

    export default {
        name: "class-manage",
        setup() {
            return {
                data,
                columns,
            };
        },
        components: {
            SmileOutlined,
            DownOutlined,
        },
    }
</script>

<style scoped>

</style>