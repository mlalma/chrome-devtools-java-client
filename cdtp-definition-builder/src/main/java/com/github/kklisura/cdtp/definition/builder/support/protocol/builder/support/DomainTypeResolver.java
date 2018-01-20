package com.github.kklisura.cdtp.definition.builder.support.protocol.builder.support;

import com.github.kklisura.cdtp.definition.builder.protocol.types.Type;

/**
 * Domain type resolves type given a domain and its object.
 */
@FunctionalInterface
public interface DomainTypeResolver {
	Type resolve(String domain, String object);
}