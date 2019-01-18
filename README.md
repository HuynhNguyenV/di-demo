# di-demo

# @Autowired
We can use the @Autowired annotation to mark the dependency that Spring is going to resolve and inject. We can use this annotation with a **constructor**, **setter**, or **field injection**.

# @Qualifier
This annotation helps fine-tune annotation-based auto-wiring. There may be scenarios when we create more than one bean of the same type and want to wire only one of them with a property. This can be controlled using the @Qualifier annotation along with the @Autowired annotation.

# @Primary
We use the  @Primary to give higher preference to a bean when there are multiple beans of the same type.
