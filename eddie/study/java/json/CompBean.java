package eddie.study.java.json;

import java.util.List;

/**
 * Created by user on 2017/3/16.
 */
public class CompBean {
    /**
     * data : {"end_date":"-","changerecords":[],"address":"重庆市渝中区瑞天路182号6单元1-2#","reg_no":"500103008812619","oper_name":"官珉","branches":[],"credit_no":"91500103MA5U6FHX56","term_start":"2016-06-16","province":"CQ","partners":[{"stock_type":"自然人","identify_no":"（非公示项）","real_capi_items":[],"name":"官珉","identify_type":"（非公示项）","should_capi_items":[{"should_capi_date":"-","invest_type":"","shoud_capi":"100 万人民币"}]},{"stock_type":"自然人","identify_no":"（非公示项）","real_capi_items":[],"name":"邓小柱","identify_type":"（非公示项）","should_capi_items":[{"should_capi_date":"-","invest_type":"","shoud_capi":"100 万人民币"}]}],"check_date":"2016-06-16","scope":"预包装食品经营（依法须经批准的项目，经相关部门批准后方可开展经营活动）；销售初级农产品、日用百货、办公用品、工艺美术品（不含文物）；货物进出口（法律、行政法规禁止的项目除外，法律、行政法规限制的项目取得许可后经营）。『以上范围法律、法规、国务院决定禁止经营的不得经营；法律、法规、国务院决定规定应经审批而未获审批前不得经营』★★","name":"重庆千香汇商贸有限公司","belong_org":"重庆市工商行政管理局渝中区分局","term_end":"永久","id":"6681b7e7-216b-4bc9-b322-54c5e18f3abd","org_no":"MA5U6FHX5","abnormal_items":[],"employees":[{"name":"官珉","job_title":"执行董事、经理"},{"name":"邓小柱","job_title":"监事"}],"regist_capi":"200 万人民币","econ_kind":"有限责任公司(自然人投资或控股)","start_date":"2016-06-16","status":"存续"}
     * message : 查询成功
     * status : 200
     */
    public DataEntity data;
    public String message;
    public String status;

    public static class DataEntity {
        /**
         * end_date : -
         * changerecords : []
         * address : 重庆市渝中区瑞天路182号6单元1-2#
         * reg_no : 500103008812619
         * oper_name : 官珉
         * branches : []
         * credit_no : 91500103MA5U6FHX56
         * term_start : 2016-06-16
         * province : CQ
         * partners : [{"stock_type":"自然人","identify_no":"（非公示项）","real_capi_items":[],"name":"官珉","identify_type":"（非公示项）","should_capi_items":[{"should_capi_date":"-","invest_type":"","shoud_capi":"100 万人民币"}]},{"stock_type":"自然人","identify_no":"（非公示项）","real_capi_items":[],"name":"邓小柱","identify_type":"（非公示项）","should_capi_items":[{"should_capi_date":"-","invest_type":"","shoud_capi":"100 万人民币"}]}]
         * check_date : 2016-06-16
         * scope : 预包装食品经营（依法须经批准的项目，经相关部门批准后方可开展经营活动）；销售初级农产品、日用百货、办公用品、工艺美术品（不含文物）；货物进出口（法律、行政法规禁止的项目除外，法律、行政法规限制的项目取得许可后经营）。『以上范围法律、法规、国务院决定禁止经营的不得经营；法律、法规、国务院决定规定应经审批而未获审批前不得经营』★★
         * name : 重庆千香汇商贸有限公司
         * belong_org : 重庆市工商行政管理局渝中区分局
         * term_end : 永久
         * id : 6681b7e7-216b-4bc9-b322-54c5e18f3abd
         * org_no : MA5U6FHX5
         * abnormal_items : []
         * employees : [{"name":"官珉","job_title":"执行董事、经理"},{"name":"邓小柱","job_title":"监事"}]
         * regist_capi : 200 万人民币
         * econ_kind : 有限责任公司(自然人投资或控股)
         * start_date : 2016-06-16
         * status : 存续
         */
        public String end_date;
        public List<?> changerecords;
        public String address;
        public String reg_no;
        public String oper_name;
        public List<?> branches;
        public String credit_no;
        public String term_start;
        public String province;
        public List<PartnersEntity> partners;
        public String check_date;
        public String scope;
        public String name;
        public String belong_org;
        public String term_end;
        public String id;
        public String org_no;
        public List<?> abnormal_items;
        public List<EmployeesEntity> employees;
        public String regist_capi;
        public String econ_kind;
        public String start_date;
        public String status;

        public static class PartnersEntity {
            /**
             * stock_type : 自然人
             * identify_no : （非公示项）
             * real_capi_items : []
             * name : 官珉
             * identify_type : （非公示项）
             * should_capi_items : [{"should_capi_date":"-","invest_type":"","shoud_capi":"100 万人民币"}]
             */
            public String stock_type;
            public String identify_no;
            public List<?> real_capi_items;
            public String name;
            public String identify_type;
            public List<Should_capi_itemsEntity> should_capi_items;

            public static class Should_capi_itemsEntity {
                /**
                 * should_capi_date : -
                 * invest_type :
                 * shoud_capi : 100 万人民币
                 */
                public String should_capi_date;
                public String invest_type;
                public String shoud_capi;
            }
        }

        public static class EmployeesEntity {
            /**
             * name : 官珉
             * job_title : 执行董事、经理
             */
            public String name;
            public String job_title;
        }
    }
}
