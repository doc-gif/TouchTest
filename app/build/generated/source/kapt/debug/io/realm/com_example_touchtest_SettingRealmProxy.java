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
public class com_example_touchtest_SettingRealmProxy extends com.example.touchtest.Setting
    implements RealmObjectProxy, com_example_touchtest_SettingRealmProxyInterface {

    static final class SettingColumnInfo extends ColumnInfo {
        long csvIDColKey;
        long numQueColKey;
        long numColKey;
        long currentColKey;

        SettingColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Setting");
            this.csvIDColKey = addColumnDetails("csvID", "csvID", objectSchemaInfo);
            this.numQueColKey = addColumnDetails("numQue", "numQue", objectSchemaInfo);
            this.numColKey = addColumnDetails("num", "num", objectSchemaInfo);
            this.currentColKey = addColumnDetails("current", "current", objectSchemaInfo);
        }

        SettingColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SettingColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SettingColumnInfo src = (SettingColumnInfo) rawSrc;
            final SettingColumnInfo dst = (SettingColumnInfo) rawDst;
            dst.csvIDColKey = src.csvIDColKey;
            dst.numQueColKey = src.numQueColKey;
            dst.numColKey = src.numColKey;
            dst.currentColKey = src.currentColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SettingColumnInfo columnInfo;
    private ProxyState<com.example.touchtest.Setting> proxyState;

    com_example_touchtest_SettingRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SettingColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.touchtest.Setting>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$csvID() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.csvIDColKey);
    }

    @Override
    public void realmSet$csvID(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.csvIDColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.csvIDColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$numQue() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numQueColKey);
    }

    @Override
    public void realmSet$numQue(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numQueColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numQueColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$num() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numColKey);
    }

    @Override
    public void realmSet$num(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$current() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.currentColKey);
    }

    @Override
    public void realmSet$current(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.currentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.currentColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Setting", false, 4, 0);
        builder.addPersistedProperty("csvID", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numQue", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("num", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("current", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SettingColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SettingColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Setting";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Setting";
    }

    @SuppressWarnings("cast")
    public static com.example.touchtest.Setting createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.touchtest.Setting obj = realm.createObjectInternal(com.example.touchtest.Setting.class, true, excludeFields);

        final com_example_touchtest_SettingRealmProxyInterface objProxy = (com_example_touchtest_SettingRealmProxyInterface) obj;
        if (json.has("csvID")) {
            if (json.isNull("csvID")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'csvID' to null.");
            } else {
                objProxy.realmSet$csvID((int) json.getInt("csvID"));
            }
        }
        if (json.has("numQue")) {
            if (json.isNull("numQue")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numQue' to null.");
            } else {
                objProxy.realmSet$numQue((int) json.getInt("numQue"));
            }
        }
        if (json.has("num")) {
            if (json.isNull("num")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'num' to null.");
            } else {
                objProxy.realmSet$num((int) json.getInt("num"));
            }
        }
        if (json.has("current")) {
            if (json.isNull("current")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
            } else {
                objProxy.realmSet$current((int) json.getInt("current"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.touchtest.Setting createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.touchtest.Setting obj = new com.example.touchtest.Setting();
        final com_example_touchtest_SettingRealmProxyInterface objProxy = (com_example_touchtest_SettingRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("csvID")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$csvID((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'csvID' to null.");
                }
            } else if (name.equals("numQue")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numQue((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numQue' to null.");
                }
            } else if (name.equals("num")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$num((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'num' to null.");
                }
            } else if (name.equals("current")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$current((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_example_touchtest_SettingRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.touchtest.Setting.class), false, Collections.<String>emptyList());
        io.realm.com_example_touchtest_SettingRealmProxy obj = new io.realm.com_example_touchtest_SettingRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.touchtest.Setting copyOrUpdate(Realm realm, SettingColumnInfo columnInfo, com.example.touchtest.Setting object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.example.touchtest.Setting) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.touchtest.Setting copy(Realm realm, SettingColumnInfo columnInfo, com.example.touchtest.Setting newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.touchtest.Setting) cachedRealmObject;
        }

        com_example_touchtest_SettingRealmProxyInterface unmanagedSource = (com_example_touchtest_SettingRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.touchtest.Setting.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.csvIDColKey, unmanagedSource.realmGet$csvID());
        builder.addInteger(columnInfo.numQueColKey, unmanagedSource.realmGet$numQue());
        builder.addInteger(columnInfo.numColKey, unmanagedSource.realmGet$num());
        builder.addInteger(columnInfo.currentColKey, unmanagedSource.realmGet$current());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_touchtest_SettingRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.touchtest.Setting object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.touchtest.Setting.class);
        long tableNativePtr = table.getNativePtr();
        SettingColumnInfo columnInfo = (SettingColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.Setting.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.csvIDColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$csvID(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numQueColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$numQue(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$num(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.currentColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$current(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.touchtest.Setting.class);
        long tableNativePtr = table.getNativePtr();
        SettingColumnInfo columnInfo = (SettingColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.Setting.class);
        com.example.touchtest.Setting object = null;
        while (objects.hasNext()) {
            object = (com.example.touchtest.Setting) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.csvIDColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$csvID(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numQueColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$numQue(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$num(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.currentColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$current(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.touchtest.Setting object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.touchtest.Setting.class);
        long tableNativePtr = table.getNativePtr();
        SettingColumnInfo columnInfo = (SettingColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.Setting.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.csvIDColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$csvID(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numQueColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$numQue(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$num(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.currentColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$current(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.touchtest.Setting.class);
        long tableNativePtr = table.getNativePtr();
        SettingColumnInfo columnInfo = (SettingColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.Setting.class);
        com.example.touchtest.Setting object = null;
        while (objects.hasNext()) {
            object = (com.example.touchtest.Setting) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.csvIDColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$csvID(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numQueColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$numQue(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$num(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.currentColKey, objKey, ((com_example_touchtest_SettingRealmProxyInterface) object).realmGet$current(), false);
        }
    }

    public static com.example.touchtest.Setting createDetachedCopy(com.example.touchtest.Setting realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.touchtest.Setting unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.touchtest.Setting();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.touchtest.Setting) cachedObject.object;
            }
            unmanagedObject = (com.example.touchtest.Setting) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_touchtest_SettingRealmProxyInterface unmanagedCopy = (com_example_touchtest_SettingRealmProxyInterface) unmanagedObject;
        com_example_touchtest_SettingRealmProxyInterface realmSource = (com_example_touchtest_SettingRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$csvID(realmSource.realmGet$csvID());
        unmanagedCopy.realmSet$numQue(realmSource.realmGet$numQue());
        unmanagedCopy.realmSet$num(realmSource.realmGet$num());
        unmanagedCopy.realmSet$current(realmSource.realmGet$current());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Setting = proxy[");
        stringBuilder.append("{csvID:");
        stringBuilder.append(realmGet$csvID());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numQue:");
        stringBuilder.append(realmGet$numQue());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{num:");
        stringBuilder.append(realmGet$num());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{current:");
        stringBuilder.append(realmGet$current());
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
        com_example_touchtest_SettingRealmProxy aSetting = (com_example_touchtest_SettingRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aSetting.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSetting.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aSetting.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
