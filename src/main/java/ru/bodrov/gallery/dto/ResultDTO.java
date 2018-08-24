package ru.bodrov.gallery.dto;

import org.jetbrains.annotations.Nullable;

public class ResultDTO {

    @Nullable
    private Boolean success = true;

    @Nullable
    private String message = "";

    public ResultDTO(@Nullable Boolean success, @Nullable String message) {
        this.success = success;
        this.message = message;
    }

    public ResultDTO(@Nullable String message) {
        this.message = message;
    }

    public ResultDTO() {
    }

    public ResultDTO(@Nullable Boolean success) {
        this.success = success;
    }

    @Nullable
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(@Nullable Boolean success) {
        this.success = success;
    }

    @Nullable
    public String getMessage() {
        return message;
    }

    public void setMessage(@Nullable String message) {
        this.message = message;
    }

}
