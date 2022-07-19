package com.example.linkedlistbysimon

class LinkedList {

    private var first: Node? = null

    private val lastNode: Node?
        get() {
            var currentNode = first
            currentNode?.let { return currentNode }
            while (currentNode?.next != null) {
                currentNode = currentNode.next
            }
            return currentNode
        }


    fun addNode(data: Int) {
        val newNode = Node(data, null, lastNode)
        if (first == null) {
            first = newNode
        } else {
            lastNode?.next = newNode
        }
    }

    fun removeLastNode() {
        val preLast = lastNode?.prev
        preLast?.next = null
    }
}

data class Node(val data: Int, var next: Node?, var prev: Node?)

