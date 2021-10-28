package com.xyk.mywayes.client;

import com.alibaba.fastjson.JSONObject;
import com.xyk.mywaycommon.model.User;
import com.xyk.mywaycommon.util.UUIDUtils;
import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

/**
 * @author xyk
 * @ClassName EsClient
 * @CreateDate 2021/10/28
 * @Description
 */
public class EsClient {

    private static final String HOST = "47.114.151.222";

    private static final Integer PORT = 9200;

    public static void main(String[] args) throws IOException {
        try (RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost(HOST, PORT, "http")))) {

            //索引操作
            //新增
//            CreateIndexResponse response = client.indices().create(new CreateIndexRequest("user"), RequestOptions.DEFAULT);
            //查询
//            GetIndexResponse response = client.indices().get(new GetIndexRequest("user"), RequestOptions.DEFAULT);
            //删除
//            AcknowledgedResponse response = client.indices().delete(new DeleteIndexRequest("user"), RequestOptions.DEFAULT);

            //文档操作
            //新增文档
//            IndexRequest request = new IndexRequest();
//            request.index("user").id(UUIDUtils.getUUID());
//            User user = User.builder().name("xkx").age(18).sex("f").build();
//            request.source(JSONObject.toJSONString(user), XContentType.JSON);
//            IndexResponse response = client.index(request, RequestOptions.DEFAULT);

            //修改文档
//            UpdateRequest request = new UpdateRequest();
//            request.index("user").id("1001");
//            request.doc(XContentType.JSON, "age", 18);
//            UpdateResponse response = client.update(request, RequestOptions.DEFAULT);

            //查询文档
//            GetRequest request = new GetRequest().index("user").id("1001");
//            GetResponse response = client.get(request, RequestOptions.DEFAULT);

            //删除文档
//            DeleteRequest request = new DeleteRequest().index("user").id("af736380379040caa39886ebd26dfb78");
//            DeleteResponse response = client.delete(request, RequestOptions.DEFAULT);

            //查询
            SearchRequest request = new SearchRequest();
            request.indices("student");
            SearchSourceBuilder builder = new SearchSourceBuilder();
            builder.query(QueryBuilders.matchAllQuery());

            String[] excludes = {};
            String[] includes = {"name", "age"};
            builder.fetchSource(includes, excludes);

            request.source(builder);
            SearchResponse response = client.search(request, RequestOptions.DEFAULT);
            System.out.println("操作结果：" + JSONObject.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
