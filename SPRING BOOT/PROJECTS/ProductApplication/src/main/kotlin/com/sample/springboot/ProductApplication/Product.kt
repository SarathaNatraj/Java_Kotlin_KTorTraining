package com.sample.springboot.ProductApplication

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigInteger

@Document()
data class Product (
    var prodCode:String,
    var prodName:String,
    var prodDetail:String,
    @Id var id: BigInteger? = null
)