package com.gn.springbootstarterjieba.keyword;


import com.huaban.analysis.jieba.extension.ExternalKeywordDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rex.ran
 * @desc
 * @date 2022-11-12-16:06
 */
public class StringDemoKeyWordDataSource implements ExternalKeywordDataSource {

    @Override
    public List<String> gatherKeyword() {
        final ArrayList<String> keywords = new ArrayList<>();
        keywords.add("血压偏高");
        return keywords;
    }
}
