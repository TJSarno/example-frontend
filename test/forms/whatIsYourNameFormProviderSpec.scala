package forms

import forms.behaviours.StringFieldBehaviours
import play.api.data.FormError

class whatIsYourNameFormProviderSpec extends StringFieldBehaviours {

  val form = new whatIsYourNameFormProvider()()

  ".firstName" - {

    val fieldName = "firstName"
    val requiredKey = "whatIsYourName.error.firstName.required"
    val lengthKey = "whatIsYourName.error.firstName.length"
    val maxLength = 100

    behave like fieldThatBindsValidData(
      form,
      fieldName,
      stringsWithMaxLength(maxLength)
    )

    behave like fieldWithMaxLength(
      form,
      fieldName,
      maxLength = maxLength,
      lengthError = FormError(fieldName, lengthKey, Seq(maxLength))
    )

    behave like mandatoryField(
      form,
      fieldName,
      requiredError = FormError(fieldName, requiredKey)
    )
  }

  ".surname" - {

    val fieldName = "surname"
    val requiredKey = "whatIsYourName.error.surname.required"
    val lengthKey = "whatIsYourName.error.surname.length"
    val maxLength = 100

    behave like fieldThatBindsValidData(
      form,
      fieldName,
      stringsWithMaxLength(maxLength)
    )

    behave like fieldWithMaxLength(
      form,
      fieldName,
      maxLength = maxLength,
      lengthError = FormError(fieldName, lengthKey, Seq(maxLength))
    )

    behave like mandatoryField(
      form,
      fieldName,
      requiredError = FormError(fieldName, requiredKey)
    )
  }
}
