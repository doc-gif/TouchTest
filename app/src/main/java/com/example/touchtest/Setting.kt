package com.example.touchtest

import io.realm.RealmObject

open class Setting : RealmObject() {
    var csvID = 0
    var numQue = 0
    var num = 0
    var current = 0
}