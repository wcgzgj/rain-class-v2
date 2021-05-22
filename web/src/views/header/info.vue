<!--行业信息-->
<template>
    <a-layout>
        <a-layout-content :style="{ padding: '0 50px', marginTop: '64px' }">

            <div :style="{ background: '#fff', padding: '24px', minHeight: '380px' }">
                <a-typography>

                    <a-typography-title>介绍</a-typography-title>
                    <a-typography-paragraph>
                        在线学习（英语：Online Learning）是一种透过互联网工具来学习或训练的方式。在中国在线学习发展趋势是职业考试和个人能力提高，将一种方便、效率、低成本的学习模式。分为两类：
                        职业考试，个人技能提高。
                        企业内的在线学习是让员工透过互联网或企业内部网的工具来进行远程教育，由企业人力资源部门承办教育训练的单位将训练课程及测验题库安装于学习平台的数据库内，员工经由职务需求或前测验证程序后，选定课程内容，自行或强制指定学习进度，并于课程学习完成后进行测验，学习平台会将学员的学习时间、成绩及学习成果问卷、调查结果等数据都详细的记录下来，以作为企业日后调整与改善人力资源与教育训练策略之参考依据。
                    </a-typography-paragraph>
                    <a-typography-paragraph>
                        随着商业化的趋势，越来越多的企业级产品对更好的用户体验有了进一步的要求。带着这样的一个终极目标，我们经过大量的项目实践和总结，逐步打磨出一个服务于高校的
                        <a-typography-text mark>『确定』和『自然』</a-typography-text>
                        的设计价值观，通过模块化的解决方案，降低冗余的生产成本，让使用者沉浸于
                        <a-typography-text strong>更好的用户体验</a-typography-text>
                        。
                    </a-typography-paragraph>
                    <a-typography-title :level="2">使用方案</a-typography-title>
                    <a-typography-paragraph>
                        我们提供完善的设计原则、最佳实践和设计资源文件（
                        <a-typography-text code>Sketch</a-typography-text>
                        和
                        <a-typography-text code>Axure</a-typography-text>
                        ），来帮助业务快速设计出高质量的产品原型。
                    </a-typography-paragraph>

                    <a-typography-paragraph>
                        <ul>
                            <li>
                                <a-typography-link href="/docs/resources-cn">设计资源</a-typography-link>
                            </li>
                        </ul>
                    </a-typography-paragraph>

                    <a-typography-paragraph>
                        <blockquote>{{ blockContent }}</blockquote>
                        <pre>{{ blockContent }}</pre>
                    </a-typography-paragraph>

                    <a-typography-paragraph>
                        按
                        <a-typography-text keyboard>Esc</a-typography-text>
                        键退出阅读……
                    </a-typography-paragraph>
                </a-typography>

            </div>
        </a-layout-content>
        <a-layout-footer :style="{ textAlign: 'center' }">
            雨选课 ©2021 Created by FARO_Z
        </a-layout-footer>
    </a-layout>
</template>

<script>
    export default {
        name: "info",
        setup() {
            return {
                blockContent: `AntV 是蚂蚁金服全新一代数据可视化解决方案，致力于提供一套简单方便、专业可靠、不限可能的数据可视化最佳实践。得益于丰富的业务场景和用户需求挑战，AntV 经历多年积累与不断打磨，已支撑整个阿里集团内外 20000+ 业务系统，通过了日均千万级 UV 产品的严苛考验。
我们正在基础图表，图分析，图编辑，地理空间可视化，智能可视化等各个可视化的领域耕耘，欢迎同路人一起前行。`,
            };
        },
    }
</script>

<style scoped>
    #components-layout-demo-fixed .logo {
        width: 120px;
        height: 31px;
        background: rgba(255, 255, 255, 0.2);
        margin: 16px 24px 16px 0;
        float: left;
    }
    .site-layout .site-layout-background {
        background: #fff;
    }

    [data-theme='dark'] .site-layout .site-layout-background {
        background: #141414;
    }
</style>