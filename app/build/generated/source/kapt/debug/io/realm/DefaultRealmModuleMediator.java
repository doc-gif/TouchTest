package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(4);
        modelClasses.add(com.example.touchtest.Setting.class);
        modelClasses.add(com.example.touchtest.AnsweredNumList.class);
        modelClasses.add(com.example.touchtest.NumList.class);
        modelClasses.add(com.example.touchtest.AlphaData.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(4);
        infoMap.put(com.example.touchtest.Setting.class, io.realm.com_example_touchtest_SettingRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.touchtest.AnsweredNumList.class, io.realm.com_example_touchtest_AnsweredNumListRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.touchtest.NumList.class, io.realm.com_example_touchtest_NumListRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.example.touchtest.AlphaData.class, io.realm.com_example_touchtest_AlphaDataRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            return io.realm.com_example_touchtest_SettingRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            return io.realm.com_example_touchtest_AnsweredNumListRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            return io.realm.com_example_touchtest_NumListRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            return io.realm.com_example_touchtest_AlphaDataRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            return "Setting";
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            return "AnsweredNumList";
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            return "NumList";
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            return "AlphaData";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.example.touchtest.Setting.class)) {
                return clazz.cast(new io.realm.com_example_touchtest_SettingRealmProxy());
            }
            if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
                return clazz.cast(new io.realm.com_example_touchtest_AnsweredNumListRealmProxy());
            }
            if (clazz.equals(com.example.touchtest.NumList.class)) {
                return clazz.cast(new io.realm.com_example_touchtest_NumListRealmProxy());
            }
            if (clazz.equals(com.example.touchtest.AlphaData.class)) {
                return clazz.cast(new io.realm.com_example_touchtest_AlphaDataRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            com_example_touchtest_SettingRealmProxy.SettingColumnInfo columnInfo = (com_example_touchtest_SettingRealmProxy.SettingColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.Setting.class);
            return clazz.cast(io.realm.com_example_touchtest_SettingRealmProxy.copyOrUpdate(realm, columnInfo, (com.example.touchtest.Setting) obj, update, cache, flags));
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            com_example_touchtest_AnsweredNumListRealmProxy.AnsweredNumListColumnInfo columnInfo = (com_example_touchtest_AnsweredNumListRealmProxy.AnsweredNumListColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AnsweredNumList.class);
            return clazz.cast(io.realm.com_example_touchtest_AnsweredNumListRealmProxy.copyOrUpdate(realm, columnInfo, (com.example.touchtest.AnsweredNumList) obj, update, cache, flags));
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            com_example_touchtest_NumListRealmProxy.NumListColumnInfo columnInfo = (com_example_touchtest_NumListRealmProxy.NumListColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.NumList.class);
            return clazz.cast(io.realm.com_example_touchtest_NumListRealmProxy.copyOrUpdate(realm, columnInfo, (com.example.touchtest.NumList) obj, update, cache, flags));
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            com_example_touchtest_AlphaDataRealmProxy.AlphaDataColumnInfo columnInfo = (com_example_touchtest_AlphaDataRealmProxy.AlphaDataColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AlphaData.class);
            return clazz.cast(io.realm.com_example_touchtest_AlphaDataRealmProxy.copyOrUpdate(realm, columnInfo, (com.example.touchtest.AlphaData) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            io.realm.com_example_touchtest_SettingRealmProxy.insert(realm, (com.example.touchtest.Setting) object, cache);
        } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            io.realm.com_example_touchtest_AnsweredNumListRealmProxy.insert(realm, (com.example.touchtest.AnsweredNumList) object, cache);
        } else if (clazz.equals(com.example.touchtest.NumList.class)) {
            io.realm.com_example_touchtest_NumListRealmProxy.insert(realm, (com.example.touchtest.NumList) object, cache);
        } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            io.realm.com_example_touchtest_AlphaDataRealmProxy.insert(realm, (com.example.touchtest.AlphaData) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.example.touchtest.Setting.class)) {
                io.realm.com_example_touchtest_SettingRealmProxy.insert(realm, (com.example.touchtest.Setting) object, cache);
            } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
                io.realm.com_example_touchtest_AnsweredNumListRealmProxy.insert(realm, (com.example.touchtest.AnsweredNumList) object, cache);
            } else if (clazz.equals(com.example.touchtest.NumList.class)) {
                io.realm.com_example_touchtest_NumListRealmProxy.insert(realm, (com.example.touchtest.NumList) object, cache);
            } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
                io.realm.com_example_touchtest_AlphaDataRealmProxy.insert(realm, (com.example.touchtest.AlphaData) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.example.touchtest.Setting.class)) {
                    io.realm.com_example_touchtest_SettingRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
                    io.realm.com_example_touchtest_AnsweredNumListRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.touchtest.NumList.class)) {
                    io.realm.com_example_touchtest_NumListRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
                    io.realm.com_example_touchtest_AlphaDataRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            io.realm.com_example_touchtest_SettingRealmProxy.insertOrUpdate(realm, (com.example.touchtest.Setting) obj, cache);
        } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            io.realm.com_example_touchtest_AnsweredNumListRealmProxy.insertOrUpdate(realm, (com.example.touchtest.AnsweredNumList) obj, cache);
        } else if (clazz.equals(com.example.touchtest.NumList.class)) {
            io.realm.com_example_touchtest_NumListRealmProxy.insertOrUpdate(realm, (com.example.touchtest.NumList) obj, cache);
        } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            io.realm.com_example_touchtest_AlphaDataRealmProxy.insertOrUpdate(realm, (com.example.touchtest.AlphaData) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.example.touchtest.Setting.class)) {
                io.realm.com_example_touchtest_SettingRealmProxy.insertOrUpdate(realm, (com.example.touchtest.Setting) object, cache);
            } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
                io.realm.com_example_touchtest_AnsweredNumListRealmProxy.insertOrUpdate(realm, (com.example.touchtest.AnsweredNumList) object, cache);
            } else if (clazz.equals(com.example.touchtest.NumList.class)) {
                io.realm.com_example_touchtest_NumListRealmProxy.insertOrUpdate(realm, (com.example.touchtest.NumList) object, cache);
            } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
                io.realm.com_example_touchtest_AlphaDataRealmProxy.insertOrUpdate(realm, (com.example.touchtest.AlphaData) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.example.touchtest.Setting.class)) {
                    io.realm.com_example_touchtest_SettingRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
                    io.realm.com_example_touchtest_AnsweredNumListRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.touchtest.NumList.class)) {
                    io.realm.com_example_touchtest_NumListRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
                    io.realm.com_example_touchtest_AlphaDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            return clazz.cast(io.realm.com_example_touchtest_SettingRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            return clazz.cast(io.realm.com_example_touchtest_AnsweredNumListRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            return clazz.cast(io.realm.com_example_touchtest_NumListRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            return clazz.cast(io.realm.com_example_touchtest_AlphaDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            return clazz.cast(io.realm.com_example_touchtest_SettingRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            return clazz.cast(io.realm.com_example_touchtest_AnsweredNumListRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            return clazz.cast(io.realm.com_example_touchtest_NumListRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            return clazz.cast(io.realm.com_example_touchtest_AlphaDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            return clazz.cast(io.realm.com_example_touchtest_SettingRealmProxy.createDetachedCopy((com.example.touchtest.Setting) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            return clazz.cast(io.realm.com_example_touchtest_AnsweredNumListRealmProxy.createDetachedCopy((com.example.touchtest.AnsweredNumList) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            return clazz.cast(io.realm.com_example_touchtest_NumListRealmProxy.createDetachedCopy((com.example.touchtest.NumList) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            return clazz.cast(io.realm.com_example_touchtest_AlphaDataRealmProxy.createDetachedCopy((com.example.touchtest.AlphaData) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(com.example.touchtest.Setting.class)) {
            return false;
        }
        if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            return false;
        }
        if (clazz.equals(com.example.touchtest.NumList.class)) {
            return false;
        }
        if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(com.example.touchtest.Setting.class)) {
            throw getNotEmbeddedClassException("com.example.touchtest.Setting");
        } else if (clazz.equals(com.example.touchtest.AnsweredNumList.class)) {
            throw getNotEmbeddedClassException("com.example.touchtest.AnsweredNumList");
        } else if (clazz.equals(com.example.touchtest.NumList.class)) {
            throw getNotEmbeddedClassException("com.example.touchtest.NumList");
        } else if (clazz.equals(com.example.touchtest.AlphaData.class)) {
            throw getNotEmbeddedClassException("com.example.touchtest.AlphaData");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
