package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2ContainerResourceMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder> {

    io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta2ContainerResourceMetricStatusBuilder() {
        this(true);
    }

    public V2beta2ContainerResourceMetricStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta2ContainerResourceMetricStatus(), validationEnabled);
    }

    public V2beta2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta2ContainerResourceMetricStatus(), validationEnabled);
    }

    public V2beta2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus instance) {
        this(fluent, instance, true);
    }

    public V2beta2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withContainer(instance.getContainer());
        
        fluent.withCurrent(instance.getCurrent());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus instance) {
        this(instance,true);
    }

    public V2beta2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withContainer(instance.getContainer());
        
        this.withCurrent(instance.getCurrent());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus build() {
        V2beta2ContainerResourceMetricStatus buildable = new V2beta2ContainerResourceMetricStatus();
        buildable.setContainer(fluent.getContainer());
        buildable.setCurrent(fluent.getCurrent());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta2ContainerResourceMetricStatusBuilder that = (V2beta2ContainerResourceMetricStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
