package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1APIGroupBuilder extends io.kubernetes.client.openapi.models.V1APIGroupFluentImpl<io.kubernetes.client.openapi.models.V1APIGroupBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIGroup,io.kubernetes.client.openapi.models.V1APIGroupBuilder> {

    io.kubernetes.client.openapi.models.V1APIGroupFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1APIGroupBuilder() {
        this(true);
    }

    public V1APIGroupBuilder(java.lang.Boolean validationEnabled) {
        this(new V1APIGroup(), validationEnabled);
    }

    public V1APIGroupBuilder(io.kubernetes.client.openapi.models.V1APIGroupFluent<?> fluent) {
        this(fluent, true);
    }

    public V1APIGroupBuilder(io.kubernetes.client.openapi.models.V1APIGroupFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1APIGroup(), validationEnabled);
    }

    public V1APIGroupBuilder(io.kubernetes.client.openapi.models.V1APIGroupFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIGroup instance) {
        this(fluent, instance, true);
    }

    public V1APIGroupBuilder(io.kubernetes.client.openapi.models.V1APIGroupFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIGroup instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        fluent.withPreferredVersion(instance.getPreferredVersion());
        
        fluent.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());
        
        fluent.withVersions(instance.getVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1APIGroupBuilder(io.kubernetes.client.openapi.models.V1APIGroup instance) {
        this(instance,true);
    }

    public V1APIGroupBuilder(io.kubernetes.client.openapi.models.V1APIGroup instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withPreferredVersion(instance.getPreferredVersion());
        
        this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());
        
        this.withVersions(instance.getVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1APIGroup build() {
        V1APIGroup buildable = new V1APIGroup();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        buildable.setPreferredVersion(fluent.getPreferredVersion());
        buildable.setServerAddressByClientCIDRs(fluent.getServerAddressByClientCIDRs());
        buildable.setVersions(fluent.getVersions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1APIGroupBuilder that = (V1APIGroupBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
