package

import com.htxk.ruoyi.common.core.domain.Ztree;
import com.htxk.ruoyi.common.core.text.Convert;
import com.htxk.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

com.htxk.edusystem.service.impl;
                                                                                                                                                                    com.htxk.edusystem.mapper.EduPaperMapper;
    com.htxk.edusystem.domain.EduPaper;
    com.htxk.edusystem.service.IEduPaperService;

/**
 * 试卷Service业务层处理
 *
 * @author maple
 * @date 2021-03-18
 */
@Service
public class EduPaperServiceImpl implements IEduPaperService {
    @Autowired
    private EduPaperMapper eduPaperMapper;

    /**
     * 查询试卷
     *
     * @param id 试卷ID
     * @return 试卷
     */
    @Override
    public EduPaper selectEduPaperById(Long id) {
        return eduPaperMapper.selectEduPaperById(id);
    }

    /**
     * 查询试卷列表
     *
     * @param eduPaper 试卷
     * @return 试卷
     */
    @Override
    public List<EduPaper> selectEduPaperList(EduPaper eduPaper) {
        return eduPaperMapper.selectEduPaperList(eduPaper);
    }

    /**
     * 新增试卷
     *
     * @param eduPaper 试卷
     * @return 结果
     */
    @Override
    public int insertEduPaper(EduPaper eduPaper) {
                                                                                                                                                                                                                                                                    eduPaper.setCreateTime(DateUtils.getNowDate());
                                                                                        return eduPaperMapper.insertEduPaper(eduPaper);
    }

    /**
     * 修改试卷
     *
     * @param eduPaper 试卷
     * @return 结果
     */
    @Override
    public int updateEduPaper(EduPaper eduPaper) {
                                                                                                                                                                                                                                                                                                            eduPaper.setUpdateTime(DateUtils.getNowDate());
                                                return eduPaperMapper.updateEduPaper(eduPaper);
    }

    /**
     * 删除试卷对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEduPaperByIds(String ids) {
        return eduPaperMapper.deleteEduPaperByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除试卷信息
     *
     * @param id 试卷ID
     * @return 结果
     */
    @Override
    public int deleteEduPaperById(Long id) {
        return eduPaperMapper.deleteEduPaperById(id);
    }
    }