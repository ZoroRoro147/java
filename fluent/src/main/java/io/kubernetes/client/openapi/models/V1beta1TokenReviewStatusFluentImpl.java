package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1beta1TokenReviewStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent<A> {

    private java.util.List<java.lang.String> audiences;
    private java.lang.Boolean authenticated;
    private java.lang.String error;
    private io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder user;

    public V1beta1TokenReviewStatusFluentImpl() {
    }

    public V1beta1TokenReviewStatusFluentImpl(io.kubernetes.client.openapi.models.V1beta1TokenReviewStatus instance) {
        this.withAudiences(instance.getAudiences());
        
        this.withAuthenticated(instance.getAuthenticated());
        
        this.withError(instance.getError());
        
        this.withUser(instance.getUser());
    }

    public A addToAudiences(int index,java.lang.String item) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        this.audiences.add(index, item);
        return (A)this;
    }

    public A setToAudiences(int index,java.lang.String item) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        this.audiences.set(index, item); return (A)this;
    }

    public A addToAudiences(java.lang.String... items) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.audiences.add(item);} return (A)this;
    }

    public A addAllToAudiences(java.util.Collection<java.lang.String> items) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.audiences.add(item);} return (A)this;
    }

    public A removeFromAudiences(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
    }

    public A removeAllFromAudiences(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getAudiences() {
        return this.audiences;
    }

    public java.lang.String getAudience(int index) {
        return this.audiences.get(index);
    }

    public java.lang.String getFirstAudience() {
        return this.audiences.get(0);
    }

    public java.lang.String getLastAudience() {
        return this.audiences.get(audiences.size() - 1);
    }

    public java.lang.String getMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: audiences) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: audiences) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withAudiences(java.util.List<java.lang.String> audiences) {
        if (this.audiences != null) { _visitables.get("audiences").removeAll(this.audiences);}
        if (audiences != null) {this.audiences = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : audiences){this.addToAudiences(item);}} else { this.audiences = null;} return (A) this;
    }

    public A withAudiences(java.lang.String... audiences) {
        if (this.audiences != null) {this.audiences.clear();}
        if (audiences != null) {for (java.lang.String item :audiences){ this.addToAudiences(item);}} return (A) this;
    }

    public java.lang.Boolean hasAudiences() {
        return audiences != null && !audiences.isEmpty();
    }

    public A addNewAudience(java.lang.String original) {
        return (A)addToAudiences(new String(original));
    }

    public java.lang.Boolean getAuthenticated() {
        return this.authenticated;
    }

    public A withAuthenticated(java.lang.Boolean authenticated) {
        this.authenticated=authenticated; return (A) this;
    }

    public java.lang.Boolean hasAuthenticated() {
        return this.authenticated != null;
    }

    public java.lang.String getError() {
        return this.error;
    }

    public A withError(java.lang.String error) {
        this.error=error; return (A) this;
    }

    public java.lang.Boolean hasError() {
        return this.error != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withError instead.
     */
        public A withNewError(java.lang.String original) {
        return (A)withError(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildUser instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1UserInfo getUser() {
        return this.user!=null?this.user.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1UserInfo buildUser() {
        return this.user!=null?this.user.build():null;
    }

    public A withUser(io.kubernetes.client.openapi.models.V1beta1UserInfo user) {
        _visitables.get("user").remove(this.user);
        if (user!=null){ this.user= new io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder(user); _visitables.get("user").add(this.user);} return (A) this;
    }

    public java.lang.Boolean hasUser() {
        return this.user != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> withNewUser() {
        return new io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluentImpl.UserNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> withNewUserLike(io.kubernetes.client.openapi.models.V1beta1UserInfo item) {
        return new io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluentImpl.UserNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> editUser() {
        return withNewUserLike(getUser());
    }

    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> editOrNewUser() {
        return withNewUserLike(getUser() != null ? getUser(): new io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> editOrNewUserLike(io.kubernetes.client.openapi.models.V1beta1UserInfo item) {
        return withNewUserLike(getUser() != null ? getUser(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1TokenReviewStatusFluentImpl that = (V1beta1TokenReviewStatusFluentImpl) o;
        if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
        if (authenticated != null ? !authenticated.equals(that.authenticated) :that.authenticated != null) return false;
        if (error != null ? !error.equals(that.error) :that.error != null) return false;
        if (user != null ? !user.equals(that.user) :that.user != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(audiences,  authenticated,  error,  user,  super.hashCode());
    }

    public class UserNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1UserInfoFluentImpl<io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<N>> implements io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder builder;

            UserNestedImpl(io.kubernetes.client.openapi.models.V1beta1UserInfo item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder(this, item);
                        
            }

            UserNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1TokenReviewStatusFluentImpl.this.withUser(builder.build());
            }

            public N endUser() {
                return and();
            }
    }


}
