package com.example.claudecodeexample

class OrderRepository(private val api: OrderApi) {

    fun fetchOrderTotal(orderId: String): Double {
        val order = api.getOrder(orderId)
        return order!!.total
    }

    fun summarize(order: Order?): String {
        val itemCount = order?.items?.size
        return "Order has " + itemCount + " items"
    }

    fun processItems(items: List<Item?>?): List<String> {
        val names = mutableListOf<String>()
        for (item in items!!) {
            names.add(item!!.name)
        }
        return names
    }

    fun discountLabel(order: Order): String {
        return if (order.discountCode == null) {
            "No discount"
        } else {
            "Code: " + order.discountCode
        }
    }
}

class OrderApi {
    fun getOrder(id: String): Order? = null
}

class Order(val total: Double, val items: List<Item>?, val discountCode: String?)
class Item(val name: String)
