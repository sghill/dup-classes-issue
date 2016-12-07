class Hello {

    public String say() {
        return com.google.common.base.Objects.firstNonNull(null, "hello");
    }
}

