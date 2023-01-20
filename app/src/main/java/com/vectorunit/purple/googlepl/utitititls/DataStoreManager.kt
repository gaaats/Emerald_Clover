package com.vectorunit.purple.googlepl.utitititls

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataStoreManager @Inject constructor(context: Application) {

    suspend fun gtgthyyhhyyh(gthyhyhyhyjudd: Preferences.Key<String>): String? {
        val gthyhyjujju = gtghyhyhyhy.data.first()
        return gthyhyjujju[gthyhyhyhyjudd]
    }

    suspend fun vfvfbgggt3gt2tg2tg(key: Preferences.Key<String>, value: String) {
        gtghyhyhyhy.edit {
            it[key] = value
        }
    }

    companion object {
        val gtgthyjuujuj = stringPreferencesKey("appsChecker")
        val frrgtgtgtgthyhyjuju = stringPreferencesKey("randomId")
        val vbggbnhnhhhyhy = stringPreferencesKey("instID")
        val vgbghyhyhyjuj = stringPreferencesKey("firstStart")
        val hyhyhyyhyhhygfrrf = stringPreferencesKey("advertID")
        val gthyhyhyjuujujuj = stringPreferencesKey("link")
        val userGeoDatdefrrffrfrrfStoreKey = stringPreferencesKey("userGeo")
        val cffrfrfgtgtgtgt = stringPreferencesKey("listOfAllGeo")
        val frrfrffrrf = stringPreferencesKey("naming")

    }

    private val Context.datasoterfrfrrf: DataStore<Preferences> by preferencesDataStore("SETTINGS")
    private val gtghyhyhyhy = context.datasoterfrfrrf



}