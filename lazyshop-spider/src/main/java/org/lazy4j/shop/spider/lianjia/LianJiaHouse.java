package org.lazy4j.shop.spider.lianjia;

import lombok.*;

/**
 * @Author：Melon
 * @Date：2017/11/28
 * @Time：下午10:41
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LianJiaHouse {

    private Integer id;
    private String title;
    private String location;
    private String room;
    private String area;
    private String direction;
    private String price;
    private String pricePerSquare;
    private String url;
    private String regionURL;
    private boolean isDown;
    private String type;
    private String height;
    private String buildYear;
    private String buildType;

}
