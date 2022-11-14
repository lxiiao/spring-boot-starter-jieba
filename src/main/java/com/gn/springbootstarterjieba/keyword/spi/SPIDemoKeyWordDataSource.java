package com.gn.springbootstarterjieba.keyword.spi;

import com.huaban.analysis.jieba.extension.ExternalKeywordDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rex.ran
 * @desc
 * @date 2022-11-12-16:06
 */
public class SPIDemoKeyWordDataSource implements ExternalKeywordDataSource {

    @Override
    public List<String> gatherKeyword() {
        // 从数据库查询
        final ArrayList<String> keywords = new ArrayList<>();
        keywords.add("");
        return keywords;
    }
}
