package com.gn.springbootstarterjieba;

import com.gn.springbootstarterjieba.keyword.StringDemoKeyWordDataSource;
import com.huaban.analysis.jieba.JiebaSegmenter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rex.ran
 * @desc 创建实例
 * @date 2022-11-12- 16:00
 */
@Configuration
public class JieBaAutoConfigure {

    @Bean
    public JiebaSegmenter createJieBaBean(){
        final JiebaSegmenter jiebaSegmenter = new JiebaSegmenter();
        // spi机制加载
        jiebaSegmenter.loadExternalUserDict();
        // 实现类形式
        jiebaSegmenter.loadExternalUserDict(new StringDemoKeyWordDataSource());
        return jiebaSegmenter;
    }

}
