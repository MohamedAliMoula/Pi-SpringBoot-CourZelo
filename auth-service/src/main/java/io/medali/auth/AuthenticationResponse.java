package io.medali.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthenticationResponse {

  private String accessToken;
  private String refreshToken;
  private boolean mfaEnabled;
  private boolean blocking;
  private String role;
  private String secretImageUri;
  private String firstName;
}