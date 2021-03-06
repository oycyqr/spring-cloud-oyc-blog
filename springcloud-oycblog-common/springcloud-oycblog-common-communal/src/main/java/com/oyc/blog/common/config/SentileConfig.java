//package com.oyc.blog.common.config;
//
///**
// * @Description:
// * @Author oyc
// * @Date 2021/1/3 5:06 下午
// */
//import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
//import com.alibaba.csp.sentinel.slots.block.RuleConstant;
//import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class SentileConfig {
//
//    @Bean
//    public SentinelResourceAspect sentinelResourceAspect() {
//        return new SentinelResourceAspect();
//    }
//
//    @PostConstruct
//    private void initRules() throws Exception {
//        FlowRule rule1 = new FlowRule();
//        rule1.setResource("hello");
//        rule1.setResource("user");
//        rule1.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        // 每秒调用最大次数为 3 次
//        rule1.setCount(3);
//
//        List<FlowRule> rules = new ArrayList<>();
//        rules.add(rule1);
//
//        // 将控制规则载入到 Sentinel
//        com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager.loadRules(rules);
//    }
//}
