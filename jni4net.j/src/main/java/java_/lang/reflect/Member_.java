// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package java_.lang.reflect;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class Member_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return java_.lang.reflect.Member_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        java_.lang.reflect.Member_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __Member extends system.Object implements java.lang.reflect.Member {
    
    protected __Member(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getModifiers();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/Class;")
    public native java.lang.Class getDeclaringClass();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isSynthetic();
}
//</generated-proxy>
