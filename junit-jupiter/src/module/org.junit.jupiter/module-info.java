/*
 * Copyright 2015-2019 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

/**
 * Aggregates all JUnit Jupiter modules.
 *
 * @moduleGraph
 * @since 5.4.0
 */
module org.junit.jupiter {
	requires transitive org.junit.jupiter.api;
	requires transitive org.junit.jupiter.engine;
	requires transitive org.junit.jupiter.params;
}
