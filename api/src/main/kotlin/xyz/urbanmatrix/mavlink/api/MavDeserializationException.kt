package xyz.urbanmatrix.mavlink.api

import java.io.IOException

class MavDeserializationException(
    override val message: String? = null,
    override val cause: Throwable? = null,
) : IOException(message, cause)
