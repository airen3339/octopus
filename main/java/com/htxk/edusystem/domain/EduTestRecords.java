package import com.htxk.ruoyi.common.annotation.Excel;

com.htxk.edusystem.domain;

/**
 * 考试记录对象 edu_test_records
 *
 * @author maple
 * @date 2021-03-18
 */
public class EduTestRecords extends BaseEntity
        {
private static final long serialVersionUID=1L;

        /** 考试记录id */
            private Long id;

            /** 试卷id */
                                                        @Excel(name = "试卷id")
                        private Long paperId;

            /** 单选题答题卡 */
                                                        @Excel(name = "单选题答题卡")
                        private String singAnswerSheet;

            /** 多选题答题卡 */
                                                        @Excel(name = "多选题答题卡")
                        private String mutiAnswerSheet;

            /** 判断题答题卡数组 */
                                                        @Excel(name = "判断题答题卡数组")
                        private String judAnswerSheet;

            /** 填空题答题卡数组 */
                                                        @Excel(name = "填空题答题卡数组")
                        private String fillAnswerSheet;

            /** 简答题答题卡数组 */
                                                        @Excel(name = "简答题答题卡数组")
                        private String essAnswerSheet;

            /** 课程id */
                                                        @Excel(name = "课程id")
                        private Long courseId;

            /** 描述 */
                                                        @Excel(name = "描述")
                        private String describe;

            /** 得分 */
                                                        @Excel(name = "得分")
                        private Double score;

            /** 总分 */
                                                        @Excel(name = "总分")
                        private Double totalPoints;

                            /** 删除标志（0代表存在 2代表删除） */
            private String delFlag;

                            public void setId(Long id)
            {
            this.id = id;
            }

    public Long getId()
            {
            return id;
            }
                            public void setPaperId(Long paperId)
            {
            this.paperId = paperId;
            }

    public Long getPaperId()
            {
            return paperId;
            }
                            public void setSingAnswerSheet(String singAnswerSheet)
            {
            this.singAnswerSheet = singAnswerSheet;
            }

    public String getSingAnswerSheet()
            {
            return singAnswerSheet;
            }
                            public void setMutiAnswerSheet(String mutiAnswerSheet)
            {
            this.mutiAnswerSheet = mutiAnswerSheet;
            }

    public String getMutiAnswerSheet()
            {
            return mutiAnswerSheet;
            }
                            public void setJudAnswerSheet(String judAnswerSheet)
            {
            this.judAnswerSheet = judAnswerSheet;
            }

    public String getJudAnswerSheet()
            {
            return judAnswerSheet;
            }
                            public void setFillAnswerSheet(String fillAnswerSheet)
            {
            this.fillAnswerSheet = fillAnswerSheet;
            }

    public String getFillAnswerSheet()
            {
            return fillAnswerSheet;
            }
                            public void setEssAnswerSheet(String essAnswerSheet)
            {
            this.essAnswerSheet = essAnswerSheet;
            }

    public String getEssAnswerSheet()
            {
            return essAnswerSheet;
            }
                            public void setCourseId(Long courseId)
            {
            this.courseId = courseId;
            }

    public Long getCourseId()
            {
            return courseId;
            }
                            public void setDescribe(String describe)
            {
            this.describe = describe;
            }

    public String getDescribe()
            {
            return describe;
            }
                            public void setScore(Double score)
            {
            this.score = score;
            }

    public Double getScore()
            {
            return score;
            }
                            public void setTotalPoints(Double totalPoints)
            {
            this.totalPoints = totalPoints;
            }

    public Double getTotalPoints()
            {
            return totalPoints;
            }
                                            public void setDelFlag(String delFlag)
            {
            this.delFlag = delFlag;
            }

    public String getDelFlag()
            {
            return delFlag;
            }
    
@Override
public String toString(){
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                                .append("id",getId())
                                .append("paperId",getPaperId())
                                .append("singAnswerSheet",getSingAnswerSheet())
                                .append("mutiAnswerSheet",getMutiAnswerSheet())
                                .append("judAnswerSheet",getJudAnswerSheet())
                                .append("fillAnswerSheet",getFillAnswerSheet())
                                .append("essAnswerSheet",getEssAnswerSheet())
                                .append("courseId",getCourseId())
                                .append("describe",getDescribe())
                                .append("score",getScore())
                                .append("totalPoints",getTotalPoints())
                                .append("createBy",getCreateBy())
                                .append("createTime",getCreateTime())
                                .append("updateBy",getUpdateBy())
                                .append("updateTime",getUpdateTime())
                                .append("delFlag",getDelFlag())
            .toString();
        }
        }