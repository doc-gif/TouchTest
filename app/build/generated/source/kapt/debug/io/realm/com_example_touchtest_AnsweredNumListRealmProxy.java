package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_touchtest_AnsweredNumListRealmProxy extends com.example.touchtest.AnsweredNumList
    implements RealmObjectProxy, com_example_touchtest_AnsweredNumListRealmProxyInterface {

    static final class AnsweredNumListColumnInfo extends ColumnInfo {
        long idColKey;

        AnsweredNumListColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AnsweredNumList");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
        }

        AnsweredNumListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AnsweredNumListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AnsweredNumListColumnInfo src = (AnsweredNumListColumnInfo) rawSrc;
            final AnsweredNumListColumnInfo dst = (AnsweredNumListColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AnsweredNumListColumnInfo columnInfo;
    private ProxyState<com.example.touchtest.AnsweredNumList> proxyState;

    com_example_touchtest_AnsweredNumListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AnsweredNumListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.touchtest.AnsweredNumList>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("AnsweredNumList", false, 1, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AnsweredNumListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AnsweredNumListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AnsweredNumList";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AnsweredNumList";
    }

    @SuppressWarnings("cast")
    public static com.example.touchtest.AnsweredNumList createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.touchtest.AnsweredNumList obj = realm.createObjectInternal(com.example.touchtest.AnsweredNumList.class, true, excludeFields);

        final com_example_touchtest_AnsweredNumListRealmProxyInterface objProxy = (com_example_touchtest_AnsweredNumListRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.touchtest.AnsweredNumList createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.touchtest.AnsweredNumList obj = new com.example.touchtest.AnsweredNumList();
        final com_example_touchtest_AnsweredNumListRealmProxyInterface objProxy = (com_example_touchtest_AnsweredNumListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_example_touchtest_AnsweredNumListRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.touchtest.AnsweredNumList.class), false, Collections.<String>emptyList());
        io.realm.com_example_touchtest_AnsweredNumListRealmProxy obj = new io.realm.com_example_touchtest_AnsweredNumListRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.touchtest.AnsweredNumList copyOrUpdate(Realm realm, AnsweredNumListColumnInfo columnInfo, com.example.touchtest.AnsweredNumList object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.touchtest.AnsweredNumList) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.touchtest.AnsweredNumList copy(Realm realm, AnsweredNumListColumnInfo columnInfo, com.example.touchtest.AnsweredNumList newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.touchtest.AnsweredNumList) cachedRealmObject;
        }

        com_example_touchtest_AnsweredNumListRealmProxyInterface unmanagedSource = (com_example_touchtest_AnsweredNumListRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.touchtest.AnsweredNumList.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_touchtest_AnsweredNumListRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.touchtest.AnsweredNumList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.touchtest.AnsweredNumList.class);
        long tableNativePtr = table.getNativePtr();
        AnsweredNumListColumnInfo columnInfo = (AnsweredNumListColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AnsweredNumList.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AnsweredNumListRealmProxyInterface) object).realmGet$id(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.touchtest.AnsweredNumList.class);
        long tableNativePtr = table.getNativePtr();
        AnsweredNumListColumnInfo columnInfo = (AnsweredNumListColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AnsweredNumList.class);
        com.example.touchtest.AnsweredNumList object = null;
        while (objects.hasNext()) {
            object = (com.example.touchtest.AnsweredNumList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AnsweredNumListRealmProxyInterface) object).realmGet$id(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.touchtest.AnsweredNumList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.touchtest.AnsweredNumList.class);
        long tableNativePtr = table.getNativePtr();
        AnsweredNumListColumnInfo columnInfo = (AnsweredNumListColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AnsweredNumList.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AnsweredNumListRealmProxyInterface) object).realmGet$id(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.touchtest.AnsweredNumList.class);
        long tableNativePtr = table.getNativePtr();
        AnsweredNumListColumnInfo columnInfo = (AnsweredNumListColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AnsweredNumList.class);
        com.example.touchtest.AnsweredNumList object = null;
        while (objects.hasNext()) {
            object = (com.example.touchtest.AnsweredNumList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AnsweredNumListRealmProxyInterface) object).realmGet$id(), false);
        }
    }

    public static com.example.touchtest.AnsweredNumList createDetachedCopy(com.example.touchtest.AnsweredNumList realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.touchtest.AnsweredNumList unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.touchtest.AnsweredNumList();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.touchtest.AnsweredNumList) cachedObject.object;
            }
            unmanagedObject = (com.example.touchtest.AnsweredNumList) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_touchtest_AnsweredNumListRealmProxyInterface unmanagedCopy = (com_example_touchtest_AnsweredNumListRealmProxyInterface) unmanagedObject;
        com_example_touchtest_AnsweredNumListRealmProxyInterface realmSource = (com_example_touchtest_AnsweredNumListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AnsweredNumList = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_touchtest_AnsweredNumListRealmProxy aAnsweredNumList = (com_example_touchtest_AnsweredNumListRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aAnsweredNumList.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAnsweredNumList.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aAnsweredNumList.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
