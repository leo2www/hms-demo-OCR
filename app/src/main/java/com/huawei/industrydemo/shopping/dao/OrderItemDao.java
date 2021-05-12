/*
    Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.industrydemo.shopping.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.huawei.industrydemo.shopping.entity.OrderItem;

import java.util.List;

/**
 * @version [Ecommerce-Demo 1.0.2.300, 2021/3/17]
 * @see [Related Classes/Methods]
 * @since [Ecommerce-Demo 1.0.2.300]
 */
@Dao
public interface OrderItemDao {
    /**
     * Query a order based on number.
     * 
     * @param orderNum order number
     * @return product
     */
    @Query("SELECT * FROM orderitem WHERE (orderNum=:orderNum)")
    List<OrderItem> queryByOrderNum(int orderNum);

    /**
     * Update an orderItem.
     * 
     * @param orderItem orderItem
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(OrderItem orderItem);
}