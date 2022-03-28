package com.pluralsight.conferencedemo.models.projections;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

/** cons:
 *      read only -> won't work for puts, posts, etc
 *      clients can ignore them
 *      not a service layer
 *
 *  pros:
 *      customizable payloads
 *      buffers entity changes
 *      minimal coding to achieve customization
 */
@Projection(name = "sessionDetail", types = { Session.class })
public interface SessionDetail {
    String getSessionName();
    String getSessionDescription();
    Integer getSessionLength();
    List<Speaker> getSpeakers();
}
