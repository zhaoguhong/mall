CREATE TABLE order (
                       `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
                       `user_id` bigint(20) unsigned NOT NULL COMMENT '用户id',
                       `proudct_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
                       `is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '逻辑删除标识 0:正常 1:已删除',
                       `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                       `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                       PRIMARY KEY (`id`),
                       KEY `idx_user_id` (`user_id`),
                       KEY `idx_create_time` (`create_time`),
                       KEY `idx_update_time` (`update_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';